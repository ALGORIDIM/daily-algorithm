#include <iostream>
using namespace std;

int main() {
    for (int a = 2; a <= 100; a++) {
        int a3 = a * a * a;
        for (int b = 2; b <= a; b++) {
            int b3 = b * b * b;
            for (int c = b; c <= a; c++) {
                int c3 = c * c * c;
                for (int d = c; d <= a; d++) {
                    int d3 = d * d * d;
                    if (a3 == b3 + c3 + d3) {
                        cout << "Cube = " << a << ", Triple = ("
                            << b << "," << c << "," << d << ")" << endl;
                    }
                }
            }
        }
    }
    return 0;
}
