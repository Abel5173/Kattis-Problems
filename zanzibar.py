t = int(input())
for k in range(t):
    l = list(map(int, input().split()))
    a = l[0]
    ct = 0
    for i in l:
        if i > a*2:
            ct += (i-(a*2))
            a = i
        elif i < a*2:
            a = i
            continue
        else:
            a = i
            continue
    print(ct)
