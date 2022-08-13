t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int, input().strip().split()))[:n]
    a.sort()
    sum = 0
    for i in range(len(a)):
        sum += abs(a[i]-a[(i+1) % len(a)])
    print((sum))
