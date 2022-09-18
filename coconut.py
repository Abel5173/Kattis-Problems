def check(d):
    cnt = 0
    for i in d:
        if d[i] >= 1:
            cnt += 1
    return cnt


s, n = map(int, input().split())
d = {}
for i in range(n):
    d[i] = 6
x = 0
while check(d) > 1:
    if check(d) == 1:
        break
    i = s
    while True:
        x += 1
        x = x % n
        if 2 <= d[x] <= 5:
            i -= 2
            if i <= 0:
                d[x] -= 1
                break
        else:
            i -= 1
            if i == 0:
                d[x] -= 1
                break
for i in d:
    if d[i] > 0:
        print(i+1)
