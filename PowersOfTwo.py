n, m = map(int, input().split())
cnt = 0
for i in range(1, n+1):
    g = str(i)
    if str(2**m) in g:
        cnt += 1
print(cnt)
