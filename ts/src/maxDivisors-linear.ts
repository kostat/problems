type Primes = Map<number, number>;
type Data = Primes[];

function fillPrimeStats(prime: number, data: Data) {
  for (var i = 1; ; i++) {
    const n = i * prime;
    if (n > data.length) break;

    const m = data[n - 1] ??= new Map();
    var value = 1;
    if (i % prime === 0) {
        value += data[i - 1].get(prime)!;
    }
    m.set(prime, value);
  }
}

function computeNumOfDivisors(primeStats: IterableIterator<number>) {
  return [...primeStats].reduce((a, b) => a * (b + 1), 1);
}

export function findMaxDivisors(max: number) {
  const data: Data = new Array(max);
  var result = 1;
  var maxDivisors = 1;

  for (var n = 2; n <= max; n++) {
    var stats = data[n - 1];
    if (!stats) {
      fillPrimeStats(n, data);
    } else {
      var numDivisors = computeNumOfDivisors(stats.values());
      if (numDivisors > maxDivisors) {
        result = n;
        maxDivisors = numDivisors;
      }
    }
  }

  return [result, maxDivisors];
}