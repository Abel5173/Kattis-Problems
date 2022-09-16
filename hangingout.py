n, m = map(int, input().split())
x = 0
cnt = 0
for i in range(m):
    a, b = map(str, input().split())
    if a == 'enter':
        if x+int(b) > n:
            cnt += 1
        else:
            x += int(b)
    elif a == 'leave':
        x -= int(b)
print(cnt)
