cnt = 0
i, j, k = map(int, input().split())
for n in range(i, j+1):
    a = n
    b = 0
    while(n > 0):
        digit = n % 10
        b = (b*10)+digit
        n = n//10
    if (abs(a-b)) % k == 0:
        cnt += 1
print(cnt)


# r, c = map(int, input().split())
# m = []
# for i in range(c):
#     a = list(map(str, input().strip().split()))[:r]
#     m.append(a)
# for i in range(c-1):
#     for i in range(r-1):
#         if m[i][j]
