function kangaroo(x1, v1, x2, v2){
    let k1Pos = x1;
    let k2Pos = x2;
    if(v1 <= v2){
        return "NO";
    }
    for(let i = 0; (k1Pos < k2Pos) ; i++){
        k1Pos = (v1 * i) + x1;
        k2Pos = (v2 * i) + x2;
        if(k1Pos === k2Pos){
            return "YES";
        }
    }
    return "NO";
}

function miniMaxSum(arr) {
    let max = arr[0];
    let min = arr[0];
    let sum = 0;
    for(let i = 0; i < arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(min> arr[i]){
            min = arr[i]
        }
        sum += arr[i];
    }
    let maxSum = sum - min;
    let minSum = sum - max;
    console.log(`${minSum} ${maxSum}`)
}

