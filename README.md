# 🏕️ 코드잇 Spring 백엔드 5기 부트캠프 팀8 Git 연습 레포지토리

## 목적

- Git의 핵심 기능을 실습하며 협업 워크플로우를 경험합니다.

---

## 1. 저장소 클론 및 프로젝트 세팅

1. **저장소 클론**
    ```bash
   # SSH로 클론
   git clone git@github.com:commicat2/team-eight.git
   
   # 또는 HTTPS로 클론
   git clone https://github.com/commicat2/team-eight.git
   cd team-eight
    ```
2. **본인 이름으로 브랜치 생성**
    - 브랜치가 없을 땐(최초 1회만):
      ```bash
      # (1) git switch -c (신규 명령, 추천)
      git switch -c 본인이름
    
      # (2) git checkout -b (구버전/호환)
      git checkout -b 본인이름
    
      # (3) git branch + 이동
      git branch 본인이름
      git switch 본인이름      # 또는 git checkout 본인이름
       ```
    - 이미 브랜치가 있다면:
      ```bash
      git switch 본인이름
      # 또는
      git checkout 본인이름
      ```
3. **Java 프로젝트 Import**
    - IntelliJ IDEA에서 `team-eight` 폴더 Open
---
## 2. 개인별 미션

각자 **`src/main/java/본인이름`** 폴더를 만들고, 그 안에 본인 이름의 Java 파일을 만들어 코드를 작성하세요.

- 예시: `src/main/java/BakJiSeok/BakJiSeok.java`

**[미션]**

1. 자신의 이름 폴더, 파일 만들기
2. 간단한 Java 코드 작성
3. 커밋 & 푸시
    ```bash
    git add .
    git commit -m "feat: add BakJiSeok.java"
    git push origin 본인이름 # upstream 설정시 git push만으로 가능
    ```

---

## 3. 팀 협업 및 Git 기능 심화 미션

#### [A] 브랜치 만들기 & PR
1. **브랜치 생성 및 전환**
   - `main` 브랜치에는 직접 푸시하지 않고, **PR(Pull Request)**를 통해 머지합니다.
   - 각자 **본인 이름 브랜치**에서 작업합니다.
      ```bash
      git switch 본인이름
      ```
2. **작업 후 GitHub에서 PR 생성**
   - GitHub에서 본인 브랜치 → main 브랜치로 PR 생성
   - 리뷰 요청 또는 셀프 리뷰 진행
3. **리뷰 반영**
   -  리뷰 또는 코멘트에 따라 로컬에서 코드 수정 후 커밋 & 푸시
      ```bash
      # 코드 수정 후
      git add .
      git commit -m "리뷰 반영: ~~"
      git push
      ```
      - ✅ PR은 브랜치 기반이므로 같은 브랜치에 푸시한 커밋은 자동으로 PR에 반영됩니다.
4. PR 하기

|옵션 이름|설명|커밋 히스토리|특징|
|-------------------------|-------------------|---------|----------------------|
| ✅ Create a merge commit | 병합 커밋을 생성하며 PR을 병합         | O (merge commit 생김) | 기본 방식, 협업 내역 보존        |
| 🔄 **Squash and merge**               | 모든 커밋을 1개로 압축하여 병합         | 🔀 1개로 합쳐짐          | 커밋 로그 깔끔, 커밋 메시지 편집 가능 |
| 🧹 **Rebase and merge**               | PR 브랜치를 `main` 위에 재배치 후 병합 | 직선형 히스토리         | 커밋 로그는 유지되되 분기점 없이 병합됨 |

---
#### [B] 충돌 상황 만들기

1. **`main` 브랜치에서 내 파일 수정 후 푸시**
   ```bash
   git switch main
   # 예: src/main/java/본인이름/본인이름.java 수정
   git add .
   git commit -m "main에서 내 파일 수정"
   git push
   ```
2. **내 브랜치에서 같은 파일 수정 후 푸시**
    ```bash
   git switch 본인이름
   # 같은 파일(src/main/java/본인이름/본인이름.java) 수정
   git add .
   git commit -m "내 브랜치에서 내 파일 또 수정"
   git push
    ```
3. **origin/main을 내 브랜치에 병합하여 충돌 발생시키기**
    ```bash
    git switch 본인이름
    git pull origin main
    ```
   - 같은 파일의 같은 줄 또는 인접한 줄이 양쪽에서 수정되었을 경우, 아래와 같은 충돌 마커가 생깁니다:
    ```diff
    <<<<<<< HEAD
    내 브랜치의 수정 내용
    =======
    main 브랜치의 수정 내용
    >>>>>>> origin/main
    ```
4. **충돌 해결 및 커밋**
   1. 에디터에서 <<<<<<<, =======, >>>>>>> 표시된 부분을 수정
   2. 수정 후:
   ```bash
   git add .
   git commit -m "Resolve conflict"
   git push
   ```
4. **GitHub에서 PR 생성 및 병합**
   - 내 브랜치 → main으로 Pull Request 생성
   - 충돌이 해결되었으면 자동 병합 가능
   - GitHub에서 `This branch has conflicts` 메시지가 사라져야 merge 가능
---
**✅ 요약**
   - `main`에서 내 파일 수정 → push
   - 내 브랜치에서도 같은 파일 수정 → push
   - 내 브랜치에서 `git pull origin main` → 충돌 발생
   - 충돌 해결 후 커밋 & push
   - PR 생성 → 충돌 없는 상태로 merge

#### [C] conflict 다른 해결 방법
1. **merge 활용**

```bash
    # PR에 conflict 발생 시, 본인 브랜치에서
    git fetch origin
    git switch 본인이름
    git merge origin main

    # 에디터에서 <<<<<<<, =======, >>>>>>> 등 직접 수정
    git add .
    git commit -m "Resolve conflict"
    git push
   ```
2. **rebase 활용**

    ```bash
    git fetch origin
    git switch 본인이름
    git rebase origin/main

    # 충돌 해결 후
    git add .
    git rebase --continue
    git push --force
    ```
   - rebase는 커밋 히스토리를 재작성하므로, 리모트 레포지토리와 다를 경우 강제 푸시 필요
   - 📌 rebase는 커밋 히스토리를 더 깔끔하게 유지할 수 있지만, 협업 중에는 --force 사용 주의
---
**✅ 요약**

| 항목      | `merge`               | `rebase`                      |
| ------- | --------------------- | ----------------------------- |
| 충돌 해결   | 병합 중 충돌 발생            | 재배치 중 충돌 발생                   |
| 커밋 히스토리 | 브랜치 구조 그대로 유지 (분기 있음) | 히스토리를 직선으로 정리                 |
| 사용 난이도  | 쉬움 (충돌 후 커밋만 하면 됨)    | 어려움 (충돌 + rebase continue 필요) |
| push 방식 | 일반 `push`             | `push --force` 필요             |

---
#### [D] merge, revert, reset 등 경험하기

- 실수로 잘못 올린 커밋을 본인 브랜치에서 `revert` 또는 `reset` 등으로 되돌려보기
- 이미 main에 merge된 PR을 revert해보고, 다시 PR을 보내보기

---

#### [E] 다양한 Git 명령어 실습

- `git log`, `git diff`, `git stash`, `git cherry-pick` 등 다양한 git 명령어를 본인 브랜치에서 직접 사용해보기

---

## 4. 예시 커밋 메시지

커밋 메시지는 [Conventional Commits](https://www.conventionalcommits.org/ko/v1.0.0/) 스타일을 사용하세요.

- `feat`: 새로운 기능 추가
- `fix`: 버그 수정
- `chore`: 빌드 업무, 패키지 관리 등 기타 변경
- `style`: 코드 포맷, 세미콜론 등 스타일 변경 (로직 변경 없음)
- `refactor`: 코드 리팩토링 (기능 변경 없음)

**예시:**

- `feat: add BakJiSeok.java`
- `fix: change message in BakJiSeok.java`
- `chore: update .gitignore`
- `style: format code in BakJiSeok.java`
- `refactor: refactor BakJiSeok.java structure`

---

## 5. 자주 쓰는 git 명령어들
### 🔧 기본 명령어
| 키워드      | 설명                     |
| -------- | ---------------------- |
| `init`   | 새 Git 저장소 생성           |
| `clone`  | 원격 저장소 복제              |
| `status` | 작업 디렉토리 상태 확인          |
| `add`    | 변경사항을 staging area에 추가 |
| `commit` | staged 파일을 저장소에 기록     |
| `log`    | 커밋 히스토리 확인             |
| `diff`   | 변경된 내용 비교              |

### 🔁 브랜치 관련
| 키워드        | 설명                      |
| ---------- | ----------------------- |
| `branch`   | 브랜치 생성, 삭제, 목록 보기       |
| `checkout` | 특정 브랜치/커밋으로 이동          |
| `switch`   | 브랜치 이동 (checkout보다 직관적) |
| `merge`    | 브랜치를 현재 브랜치에 병합         |
| `rebase`   | 브랜치 기반을 다른 브랜치 위로 옮김    |

### ☁️ 원격 저장소 관련
| 키워드      | 설명                   |
| -------- | -------------------- |
| `remote` | 원격 저장소 목록 확인 및 설정    |
| `push`   | 로컬 변경사항을 원격 저장소에 반영  |
| `pull`   | 원격 저장소에서 변경사항을 받아 병합 |
| `fetch`  | 원격 저장소에서 변경사항만 가져오기  |
| `origin` | 기본 원격 저장소 이름         |

### 🧹 히스토리 정리/수정
| 키워드           | 설명                   |
| ------------- | -------------------- |
| `reset`       | 커밋/스테이징 상태 되돌리기      |
| `revert`      | 특정 커밋 되돌리기 (새 커밋 생성) |
| `stash`       | 작업 중인 내용을 임시 저장      |
| `cherry-pick` | 특정 커밋만 선택적으로 적용      |
| `amend`       | 마지막 커밋 수정            |

### 💡 기타 자주 쓰이는 옵션
| 키워드                 | 설명                    |
| ------------------- | --------------------- |
| `-m "메시지"`          | 커밋 메시지 작성             |
| `--force` / `-f`    | 강제 명령 (ex. `push -f`) |
| `--hard` / `--soft` | reset 시 상태 지정         |
| `--no-ff`           | 병합 시 강제로 커밋 생성        |
| `--rebase`          | pull 시 rebase 방식 사용   |
