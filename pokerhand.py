l = [i for i in input().split()]
cnt = 1
a = []
for i in l:
    a.append(i[0])
for i in a:
    if cnt < a.count(i):
        cnt = a.count(i)
print(cnt)