--- 유의 사항 ---
규칙 4: 한 줄에 점을 하나만 찍는다. Clean Code 가이드의 디미터 법칙을 지키는 것을 의미한다.
규칙 6: 모든 엔티티를 작게 유지한다.
규칙 7: 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
규칙 9: 게터/세터/프로퍼티를 쓰지 않는다.
- indent는 2까지
- 함수가 10라인 예외
- 모든 원시 값과 문자열을 포장한다
- 일급 컬렉션을 쓴다.

---
## 기능 목록 정리
- [] 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
  - [x] 좌표를 입력한다.
  - [] 좌표 정보는 괄호로 둘러쌓여 있으며 쉼표로 x 값과 y값을 구분한다.
    - [] 쉼표를 기준으로 x와 y값을 구분한다.
    - [] '-'를 기준으로 X, Y 점을 구분한다.
  - [] 좌표 정보가 올바른지 검증한다.
    - [] X, Y 좌표 모두 최대 24까지 입력 가능하다.
    - [] 입력 범위를 초과할 경우 에러 문구를 출력한다.
    - [] 입력 범위를 초과할 경우 다시 입력 받는다.
  - [] 제곱근 공식으로 두 점 사이 거리를 계산한다.
  
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
