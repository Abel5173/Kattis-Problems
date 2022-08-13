N, Q = map(int, input().split())
l = list(map(int, input().split()[:N]))
for i in range(Q):
    x, a, b = map(int, input().split())
    if x == 1:
        l[a-1] = b
    else:
        print(abs(l[a-1]-l[b-1]))
