print((lambda n: "Bob" if n & 1 else "\n".join(
    ("Alice", str(n // 2))))(int(input())))
