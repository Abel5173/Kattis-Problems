from email.policy import default


n = int(input())
for i in range(n):
    a, b, c = map(int, input().split())
    if c == a+b:
        print('Possible')
    elif c == abs(a-b):
        print('Possible')
    elif c == a*b:
        print('Possible')
    elif c == a/b or c == b/a:
        print('Possible')
    else:
        print('Impossible')
