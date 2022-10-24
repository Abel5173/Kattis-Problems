n = int(input())
l = list(input())
i = 0
cnt = 0
m = 0
w = 0
while (cnt <= n+1 and i < len(l)):
    if l[i] == 'M':
        m += 1
    else:
        w += 1
    cnt = abs(w-m)
    i += 1
print(i)
