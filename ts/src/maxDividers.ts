function numOfDividers(n: number) {
    var result = 0;
  
    for (var i = 1; i <= n; i++) {
      if (n % i == 0) result++;
    }
  
    return result;
  }
  
  export function findMaxDividers(max: number) {
    var result = 0;
    var dividers = 0;
  
    for (var i = 1; i <= max; i++) {
      const n = numOfDividers(i);
      if (n > dividers) {
        dividers = n;
        result = i;
      }
    }
  
    return [result, dividers];
  }