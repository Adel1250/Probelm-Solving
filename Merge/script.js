'use strict'

const mergeTwoLists = function (list1, list2) {
    let i = 0;
    let j = 0;
    let k = 0;

    const list3 = [];

    while (i < list1.length && j < list2.length) {
        if (list1[i] <= list2[j]) {
            list3[k] = list1[i];
            i++;
            k++;
        }
        else {
            list3[k] = list2[j];
            j++;
            k++;
        }
    }

    while (i < list1.length) {
        list3[k] = list1[i];
        i++;
        k++;
    }

    while (j < list2.length) {
        list3[k] = list2[j];
        j++;
        k++;
    }

    return [...list3];
};

const list1 = [];
const list2 = [];

console.log(mergeTwoLists(list1, list2));