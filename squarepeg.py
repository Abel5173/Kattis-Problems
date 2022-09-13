l, r = map(int, input().split())
l = l**2
r = 2 * (r**2)
if l <= r:
    print('fits')
else:
    print('nope')