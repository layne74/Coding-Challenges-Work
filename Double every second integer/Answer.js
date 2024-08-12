let arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let arr2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let arr3 = [1, 2, 3];
let arr4 = [];

// Double every second int in the array
// Modifies the original array
const dblEverySecond = (params) => {
  for (let idx = 1; idx < params.length; idx += 2) {
    params[idx] = params[idx] * 2;
  }
};

// Double every second int in the array
// Modifies the original array
const dblEverySecondRecursive = (params) => {
  console.log(params);

  // Case 1: Array is empty, return an empty array.
  if (params.length == 0) return [];
  // Case 2: Array length is 1, return the array. Helps with odd length arrays.
  if (params.length <= 1) return [params[0]];

  let [first, second, ...rest] = params;
  return [first, second * 2, ...dblEverySecondRecursive(rest)];
};
