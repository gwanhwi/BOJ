#include <iostream>
#include <assert.h>
using namespace std;

int main() {
	int m, n;
	cin >> m >> n;
	assert(m >= 8);
	assert(n >= 8);
	assert(m <= 50);
	assert(n <= 50);
	char** arr = new char* [m];
	for (int i = 0; i < m; i++) {
		arr[i] = new char[n];
	}
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			cin >> arr[i][j];
		}
	}
	int least = 999;
	int count = 0;
	int move_r = 0;
	int move_d = 0;
	int a = 0;
	int r = 0;
	while (r < 2) {
		move_d = 0;
		move_r = 0;
		while (move_d < m - 7 && move_r < n - 7) {
			count = 0;
			char** add = new char* [m];
			for (int i = 0; i < m; i++) {
				add[i] = new char[n];
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					add[i][j] = arr[i][j];
				}
			}

			if (add[move_d][move_r] == 'B' && r == 1) {
				add[move_d][move_r] = 'W';
				count++;
			}
			else if (add[move_d][move_r] == 'W' && r == 1) {
				add[move_d][move_r] = 'B';
				count++;
			}

			for (int i = move_d; i < move_d + 8; i++) {

				if (i > move_d && add[i][move_r] == add[i - 1][move_r]) {
					count++;
					if (add[i - 1][move_r] == 'B') {
						add[i][move_r] = 'W';
					}
					else if (add[i - 1][move_r] == 'W') {
						add[i][move_r] = 'B';
					}
				}

				for (int j = move_r; j < move_r + 7; j++) {
					if (add[i][j] == add[i][j + 1]) {
						count++;
						if (add[i][j] == 'B') {
							add[i][j + 1] = 'W';
						}
						else if (add[i][j] == 'W') {
							add[i][j + 1] = 'B';
						}
					}
				}
			}
			if (least > count)
				least = count;
			move_r++;
			if (move_r == n - 7) {
				move_d++;
				if (move_d == m - 7)break;
				move_r = 0;
			}
			for (int i = 0; i < m; i++) {
				delete[] add[i];
			}
			delete[] add;
		}
		r++;
	}
	cout << least;
	for (int i = 0; i < m; i++) {
		delete[] arr[i];
	}
	delete[] arr;
}