function solve(arr, str1, str2) {
    let result = [];
    result = arr.slice(arr.indexOf(str1), arr.indexOf(str2) + 1);
    return result;
}
solve(['Apple Crisp',
'Mississippi Mud Pie',
'Pot Pie',
'Steak and Cheese Pie',
'Butter Chicken Pie',
'Smoked Fish Pie'],
'Pot Pie',
'Smoked Fish Pie'
);