function binarySearch(key, arr, left, right) {
    if (left > right)
        return -1;
    const mid = Math.floor((left + right) / 2);
    if (key === arr[mid])
        return mid;
    else if (key < arr[mid])
        return binarySearch(key, arr, left, mid - 1);
    else
        return binarySearch(key, arr, mid + 1, right);
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const res = binarySearch(4, arr, 0, arr.length - 1);
const str = res > -1 ? `Key is found at position ${res}` : `Key is not found`;
console.log(str);