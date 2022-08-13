n, k = map(int, input().split())
sum = 0.0
if n == k:
    for i in range(k):
        a = float(input())
        sum += a
    print(sum/n, sum/n)
else:
    for i in range(k):
        a = float(input())
        sum += a
    maxP = sum+((n-k)*(3))
    minP = sum+((n-k)*(-3))
    print(minP/n, maxP/n)
