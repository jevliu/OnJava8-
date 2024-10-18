import requests
from bs4 import BeautifulSoup

# 目标URL
url = 'http://www.gutenberg.org/files/11/11-0.txt'

# 发送GET请求
response = requests.get(url)

# 检查响应状态码
if response.status_code == 200:
    # 获取文本内容
    text = response.text

    # 保存到alice30.txt
    with open('../../../../../alice30.txt', 'w', encoding='utf-8') as file:
        file.write(text)

    print('文本已保存到alice30.txt')
else:
    print('请求失败，状态码:', response.status_code)
    