// NUMBER FUNCTIONS =============================================
/**
 * Functions zero to nine are used to create numbers from 0 to 9.
 * If an operation function is passed as an argument, the operation
 * is performed using the number as the left operand.
 * If no operation function is passed, the number itself is returned.
 *
 * @param {function} [operation] - A function representing an operation to be performed with the number.
 * @returns {number} - The result of the operation, or the number itself if no operation is provided.
 */
const zero = (operation) => operation ? operation(0) : 0;
const one = (operation) => operation ? operation(1) : 1;
const two = (operation) => operation ? operation(2) : 2;
const three = (operation) => operation ? operation(3) : 3;
const four = (operation) => operation ? operation(4) : 4;
const five = (operation) => operation ? operation(5) : 5;
const six = (operation) => operation ? operation(6) : 6;
const seven = (operation) => operation ? operation(7) : 7;
const eight = (operation) => operation ? operation(8) : 8;
const nine = (operation) => operation ? operation(9) : 9;

// OPERATIONS ===================================================
/**
 * Functions add, minus, times, and dividedBy are used to create operations.
 * Each function takes a number as an argument and returns a function that 
 * takes another number as the left operand. The returned function then 
 * performs the specified operation.
 *
 * @param {number} rightNumber - The right operand for the operation.
 * @returns {function} - A function that takes the left operand and returns the result of the operation.
 */
const add = (rightNumber) => (leftNumber) => leftNumber + rightNumber;
const minus = (rightNumber) => (leftNumber) => leftNumber - rightNumber;
const times = (rightNumber) => (leftNumber) => leftNumber * rightNumber;
const dividedBy = (rightNumber) => (leftNumber) => Math.floor(leftNumber / rightNumber);

console.log(eight(dividedBy(three())));
console.log(seven(times(five())));
console.log(four(plus(nine())));
console.log(eight(minus(three())));
console.log(six(dividedBy(two())));
