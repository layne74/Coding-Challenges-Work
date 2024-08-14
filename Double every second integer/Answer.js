let arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let arr2 = [1, 2];
let arr3 = [1];
let arr4 = [];

/**
 * Double every second integer in the array.
 * Returns a new array.
 * 
 * @param {number[]} params 
 * @returns {number[]}
 */
const dblEverySecond = (params) => {
  let result = params.map((val, idx) => {
    if (idx % 2 == 1) return val * 2;
    return val;
  });
  return result;
};

/**
 * Recursive solution to double every second integer in the array
 * Returns a new array.
 * 
 * @param {number[]} params 
 * @returns {number[]}
 */
const dblEverySecondRecursive = (params) => {
  // Case 1: Array is empty, return an empty array.
  if (params.length == 0) return [];
  // Case 2: Array length is 1, return the array. Helps with odd length arrays.
  if (params.length <= 1) return [params[0]];

  let [first, second, ...rest] = params;
  return [first, second * 2, ...dblEverySecondRecursive(rest)];
};
