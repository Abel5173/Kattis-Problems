# n, m = map(int, input().split())
# a = set()
# cnt = 0
# for i in range(n):
#     if i == 0:
#         a = set([x for x in input().split()])
#         continue
#     b = set([x for x in input().split()])
#     a = a.intersection(b)

# print(len(a))
# for i in sorted(a):
#     print(i)

n, m = map(int, input().split())
a = [x for x in input().split()]
cnt = 0
for i in range(1, n):
    a = list(filter(lambda x: (x in a), [x for x in input().split()]))
print(len(a))
for i in sorted(a):
    print(i)
