n = int(input())
l = list(map(int, input().strip().split()))[:n]
a = list(map(int, input().strip().split()))
for i in l:
    if a.count(i) == 0:
        print(i)
