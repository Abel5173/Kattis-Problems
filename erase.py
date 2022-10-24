n = int(input())
a = list(input())
b = list(input())
for i in range(n):
    for j in range(len(a)):
        if a[j] == '1':
            a[j] = '0'
        else:
            a[j] = '1'
if a == b:
    print('Deletion succeeded')
else:
    print('Deletion failed')
