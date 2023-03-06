
def simpleArraySum(ar):
    """
    sum all numbers of an array
    """
    sum = 0
    for num in ar:
        sum += num
    return sum

def get_money_spent(keyboards, drives, budget):
    keyboards.sort(reverse=True)
    drives.sort(reverse=True)

    max_spent = -1

    i, j = 0, 0


    while i < len(keyboards) and j < len(drives):
        if keyboards[i] + drives[j] <= budget:
            max_spent = max(max_spent, keyboards[i] + drives[j])
            j += 1
        else:
            i += 1

    return max_spent

