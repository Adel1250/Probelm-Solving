'use strict'

const lengthOfLastWord = function (s) {
    let i = s.length - 1;
    let cntr = 0;
    if (s.length === 1) {
        return 1;
    }
    if (s.length === 2 && s[s.length - 1] === ' ') {
        return 1;
    }
    while (s[i] === ' ') {
        i--;
        cntr++;
    }
    while (s[i] !== ' ' && i >= 0)
        i--;

    return s.length - i - 1 - cntr;
};

console.log(lengthOfLastWord("day"));