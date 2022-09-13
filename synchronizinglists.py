while True:
    n = int(input())
    if n == 0:
        break
    l1 = []
    l2 = []
    for i in range(2*n):
        a = int(input())
        if i < n:
            l1.append(a)
        else:
            l2.append(a)
    b = l1.copy()
    ans = []
    l1.sort()
    l2.sort()
    for i in b:
        x = l1.index(i)
        ans.append(l2[x])
    for i in ans:
        print(i)
