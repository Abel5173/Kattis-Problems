n = int(input())
d = {}
for i in range(n):
    b, a = map(str, input().split())
    if a not in d:
        if b == 'exit':
            d[a] = b
            print(a, 'exited', '(ANOMALY)')
        else:
            d[a] = b
            print(a, 'entered')
    else:
        if d[a] == b:
            if b == 'entry':
                print(a, 'entered', '(ANOMALY)')
            else:
                print(a, 'exited', '(ANOMALY)')
        else:
            if b == 'entry':
                print(a, 'entered')
                d[a] = 'entry'
            else:
                print(a, 'exited')
                d[a] = 'exit'
