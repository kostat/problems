function fib3(n: number): number {
  if (n <= 0) return 1;

  return fib3(n - 1) + fib3(n - 2) + fib3(n - 3);
}

// Log to console
// console.log(fib3(1));
// console.log(fib3(2));
// console.log(fib3(3));
// console.log(fib3(10));

/*function* fib3_gen() {
    [a, b, c] = [3, 4, 5]
    while (true) {
      yield a;
      [b, c] = [c, b + c];
      [a, b] = [b, a + b];
    }
  }
  
  function* fib3_gen1() {
    var [a, b, c] = [1,2,3];
    for (;;) {
  
      [a, b, c] = [c, a + c, b + c];
  
      yield a;
      
    }
  }*/

export function* fib3_gen2(seed?: [number, number, number]) {
  var [f1, f2, f3] = seed ?? [1, 1, 1];
  for (;;) {
    [f1, f2, f3] = [f1 + f2 + f3, f1, f2];
    yield f1;
  }
}

export function* fib2_gen2(seed?: [number, number]) {
  var [f1, f2] = seed ?? [1, 0];
  for (;;) {
    [f1, f2] = [f1 + f2, f1];
    yield f1;
  }
}
