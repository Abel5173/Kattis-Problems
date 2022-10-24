n = int(input())
while n > 0:
    x = int(input())
    a = [int(i) for i in input().split()]
    y = int(input())
    b = [int(i) for i in input().split()]
    l = [0]*(x+y+1)
    c = x+y+1
    for i in a[::-1]:
        c -= 1
        s = c
        for j in b[::-1]:
            l[s] += (i*j)
            s -= 1
    print(x+y)
    print(*l)
    n -= 1
