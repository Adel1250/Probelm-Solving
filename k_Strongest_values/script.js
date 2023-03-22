'use strict';

function el(value, weight) {
    this.value = value;
    this.weight = weight;
}

function compare(a, b) {
    if (a.weight < b.weight) {
        return -1;
    }
    else if (a.weight > b.weight) {
        return 1;
    }
    else {
        if (a.value < b.value) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

var getStrongest = function (arr, k) {
    arr.sort(function (a, b) { return a - b });
    const mid = Math.floor((arr.length - 1) / 2);
    const m = arr[mid];
    const weights = [];
    var ans = [];
    for (let i = 0; i < arr.length; i++) {
        weights[i] = new el(arr[i], Math.abs(arr[i] - m));
    }
    weights.sort(compare).reverse();
    for (let i = 0; i < k; i++) {
        ans[i] = weights[i].value;
    }
    return ans;
};

let arr = [6, 7, 11, 7, 6, 8];
console.log(getStrongest(arr, 5));