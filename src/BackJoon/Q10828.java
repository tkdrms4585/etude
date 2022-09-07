package BackJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {

		static int arr[] = new int[10010];
		static int in = -1;
		static int out = -1;
		static int size = 0;

		static void push(int m) {
			arr[++in] = m;
			out++;
			size++;
		}

		static void pop() {
			if (in == -1)
				System.out.println("-1");
			else {
				System.out.println(arr[out--]);
				in--;
				size--;
			}
		}

		static void size() {
			System.out.println(size);
		}

		static void empty() {
			if (in == -1)
				System.out.println("1");
			else
				System.out.println("0");
		}

		static void top() {
			if (in == -1)
				System.out.println("-1");
			else
				System.out.println(arr[in]);
		}

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				switch (s) {
				case "push":
					int m = Integer.parseInt(st.nextToken());
					push(m);
					break;
				case "pop":
					pop();
					break;
				case "size":
					size();
					break;
				case "empty":
					empty();
					break;
				case "top":
					top();
					break;

				}
			}
		}
	}
