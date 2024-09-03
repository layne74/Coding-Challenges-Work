const zero = (func) => {
    return !func ? 0 : func(0);
}

const one = (func) => {
    return !func ? 1 : func(1);
}

const two = (func) => {
    return !func ? 2 : func(2);
}

const three = (func) => {
    return !func ? 3 : func(3);
}

const four = (func) => {
    return !func ? 4 : func(4);
}

const five = (func) => {
    return !func ? 5 : func(5);
}

const six = (func) => {
    return !func ? 6 : func(6);
}

const seven = (func) => {
    return !func ? 7 : func(7);
}

const eight = (func) => {
    return !func ? 8 : func(8);
}

const nine = (func) => {
    return !func ? 9 : func(9);
}

// OPERATIONS ===================================================

const plus = (rightNum) => (leftNum) => {
    return leftNum + rightNum;
}

const minus = (rightNum) => (leftNum) => {
    return leftNum - rightNum;
}

const times = (rightNum) => (leftNum) => {
    return leftNum * rightNum;
}

const dividedBy = (rightNum) => (leftNum) => {
    return Math.floor(leftNum / rightNum);
}

console.log(eight(dividedBy(three())));
console.log(seven(times(five())));
console.log(four(plus(nine())));
console.log(eight(minus(three())));
console.log(six(dividedBy(two())))
