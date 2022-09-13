from math import sqrt


def isPrime(a):
    if a < 2:
        return False
    elif a == 2 or a == 3:
        return True
    elif a % 2 == 0 or a % 3 == 0:
        return False
    else:
        for x in range(6, int(sqrt(a))):
            if a % (x + 1) == 0 or a % (x - 1) == 0:
                return False
        return True


def isHappy(a):
    li = []
    while a > 1:
        sum = 0
        for i in str(a):
            sum += int(i)**2
        a = sum
        if a in li:
            break
        li.append(a)
    return True if a == 1 else False


n = int(input())
for i in range(1, n+1):
    a, b = map(int, input().split())
    print(a, b, 'YES') if (isPrime(b) and isHappy(b)) else print(a, b, 'NO')
