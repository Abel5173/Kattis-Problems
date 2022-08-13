l = []
N, M = map(int, input().split())
for i in range(1, N+1):
    for j in range(1, M+1):
        l.append(i+j)
maxNum = 0
for i in l:
    if maxNum <= l.count(i):
        maxNum = l.count(i)
lst = []
l.sort()
a = 0
for i in l:
    if l.count(i) == maxNum:
        if i == a:
            continue
        else:
            a = i
            lst.append(i)
for i in lst:
    print(i)
