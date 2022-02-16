<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
			<aside>
				<h2>サブメニュー</h2>
				<nav>
					<ul>
						<li>
							<a href="<%= request.getContextPath() %>/create">
								<button>新規登録</button>
							</a>
						</li>
						<li>
							<a href="<%= request.getContextPath() %>/delete">
								<button>社員削除</button>
							</a>
						</li>
						<li>
							<a href="<%= request.getContextPath() %>/update">
								<button>社員編集</button>
							</a>
						</li>
					</ul>
				</nav>
			</aside>