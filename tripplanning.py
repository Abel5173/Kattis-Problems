def by_value(item):
    return item[1]


n, m = map(int, input().split())
d = {}
for i in range(1, m+1):
    a, b = map(int, input().split())
    if (a == m or a == 1) and (b == m or b == 1):
        a, b = max(a, b), min(a, b)
        d[i] = [a, b]
    else:
        d[i] = sorted([a, b])
x = 1
l = sorted(d.values())
b = True
for i in l:
    if i[0] != x:
        print('impossible')
        b = False
        break
    x += 1
if b:
    for k, v in sorted(d.items(), key=by_value):
        print(k)
