N, P, S = map(int, input().split())
l = []
l.extend(range(1, N+1))
for i in range(S):
    x = [int(x) for x in input().split()]
    m = x[0]
    b = True
    lr = []
    for j in range(1, m+1):
        if x[j] == P:
            b = False
        else:
            lr.append(x[j])
    if b:
        print('REMOVE')
    else:
        print('KEEP')
