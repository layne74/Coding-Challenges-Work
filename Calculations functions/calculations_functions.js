const zero = (func) => {
    let leftNum = 0;
    return !func ? leftNum : func(leftNum);
}

const one = (func) => {
    let leftNum = 1;
    return !func ? leftNum : func(leftNum);
}

const two = (func) => {
    let leftNum = 2;
    return !func ? leftNum : func(leftNum);
}

const three = (func) => {
    let leftNum = 3;
    return !func ? leftNum : func(leftNum);
}

const four = (func) => {
    let leftNum = 4;
    return !func ? leftNum : func(leftNum);
}

const five = (func) => {
    let leftNum = 5;
    return !func ? leftNum : func(leftNum);
}

const six = (func) => {
    let leftNum = 6;
    return !func ? leftNum : func(leftNum);
}

const seven = (func) => {
    let leftNum = 7;
    return !func ? leftNum : func(leftNum);
}

const eight = (func) => {
    let leftNum = 8;
    return !func ? leftNum : func(leftNum);
}

const nine = (func) => {
    let leftNum = 9;
    return !func ? leftNum : func(leftNum);
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
