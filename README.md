<h1> Eclipse에서 Clone한 프로젝트를 로컬프로젝트로 Import하는 방법</h1>

<h2>1. 프로젝트 Import</h2>
<p>1. <strong>File → Import</strong> 선택.</p>
<p>2. <strong>Gradle → Existing Gradle Project</strong> 선택 → <strong>Next.</strong></p>
<p>3. Clone한 프로젝트의 경로를 선택 → <strong>Finish.</strong></p>

<h2>2. 프로젝트 설정 확인 및 빌드</h2>

<h3>(1) Gradle Sync 실행</h3>
<p>Gradle 프로젝트라면 Import 후 반드시 <strong>Gradle Sync</strong>를 실행해야 합니다.</p>
<ul>
    <li>프로젝트를 마우스 오른쪽 클릭 → <strong>Gradle → Refresh Gradle Project</strong> 선택.</li>
</ul>

<h3>(2) Java Build Path 확인</h3>
<p>Import 후, 프로젝트에서 <code>src/main/java</code> 나 다른 폴더가 누락되었다면 소스 폴더로 추가하세요.</p>
<ol>
    <li>프로젝트 우클릭 → <strong>Properties.</strong></li>
    <li><strong>Java Build Path → Source 탭.</strong></li>
    <li><strong>Add Folder</strong> 클릭 → 누락된 소스 폴더 선택.</li>
    <li><strong>Apply and Close</strong> 선택.</li>
</ol>

<h3>(3) Dynamic Web Project로 변환 (Servlet/JSP 프로젝트의 경우)</h3>
<p>Servlet/JSP 프로젝트라면 <strong>Dynamic Web Module</strong> 설정을 추가합니다:</p>
<ol>
    <li>프로젝트 우클릭 → <strong>Properties.</strong></li>
    <li><strong>Project Facets</strong> 선택.</li>
    <li><strong>Dynamic Web Module</strong>과 <strong>Java</strong> 활성화.</li>
    <li><strong>Apply and Close</strong> 선택.</li>
</ol>

<h2>3. 에러 발생 시 조치</h2>
<p>프로젝트가 정상적으로 로드되지 않는 경우, <strong>Project → Clean</strong>을 실행한 후 프로젝트를 다시 빌드합니다.</p>
