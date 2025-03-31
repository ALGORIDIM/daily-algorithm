for a in range(2, 101):
    a_cubed = a**3
    for b in range(1, a + 1):
        b_cubed = b**3
        for c in range(b, a + 1):
            c_cubed = c**3
            for d in range(c, a + 1):
                d_cubed = d**3
                if b_cubed + c_cubed + d_cubed == a_cubed:
                    print(f"Cube = {a}, Triple = ({b},{c},{d})")
