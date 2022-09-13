from itertools import combinations


def Fibonacci(n):
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)


n = int(input())
l = []
i = 0
prev = 0
while True:
    k = Fibonacci(i)
    if (prev+k) >= n:
        l.append(k)
        l.append(prev+k)
        break
    else:
        l.append(k)
        prev = k
        i += 1
s = 0
g = ()
b = False
if l[-1] == n:
    print(n)
else:
    x = len(l)-2
    ans = []
    sum = 0
    sum += l[x]
    ans.append(l[x])
    while x >= 0:
        if sum+l[x-1] <= n:
            ans.append(l[x-1])
            sum += l[x-1]
            x -= 1
        elif sum == n:
            break
        else:
            x -= 1
    ans.sort()
    print(*ans)
