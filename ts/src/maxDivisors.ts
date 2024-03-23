function numOfDivisors(n: number) {
    var result = 0;
  
    for (var i = 1; i <= n; i++) {
      if (n % i == 0) result++;
    }
  
    return result;
  }
  
  export function findMaxDivisors(max: number) {
    var result = 0;
    var divisors = 0;
  
    for (var i = 1; i <= max; i++) {
      const n = numOfDivisors(i);
      if (n > divisors) {
        divisors = n;
        result = i;
      }
    }
  
    return [result, divisors];
  }