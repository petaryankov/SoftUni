window.addEventListener("load", solve);

function solve() {
  let publishBtn = document.getElementById('form-btn');
  let firstName = document.getElementById('first-name');
  let lastName = document.getElementById('last-name');
  let age = document.getElementById('age');
  let storyTitle = document.getElementById('story-title');
  let genre = document.getElementById('genre');
  let story = document.getElementById('story');

  publishBtn.addEventListener('click', publish);

  function publish() {
    if (firstName.value == ''
      || lastName.value == ''
      || age.value == ''
      || storyTitle.value == ''
      || story.value == '') {
        return;
    }
    let parentEl = document.getElementById('preview-list');
    let li = document.createElement('li');
    li.className = 'story-info';
    let article = document.createElement('article');
    let h4 = document.createElement('h4');
    h4.textContent = `Name: ${firstName.value} ${lastName.value}`;
    let p1 = document.createElement('p');
    p1.textContent = `Age: ${age.value}`;
    let p2 = document.createElement('p');
    p2.textContent = `Title: ${storyTitle.value}`;
    let p3 = document.createElement('p');
    p3.textContent = `Genre: ${genre.value}`;
    let p4 = document.createElement('p');
    p4.textContent = story.value;
    article.appendChild(h4);
    article.appendChild(p1);
    article.appendChild(p2);
    article.appendChild(p3);
    article.appendChild(p4);
    li.appendChild(article);
    let saveBtn = document.createElement('button');
    saveBtn.className = 'save-btn';
    saveBtn.textContent = 'Save Story';
    let editBtn = document.createElement('button');
    editBtn.className = 'edit-btn';
    editBtn.textContent = 'Edit Story';
    let deleteBtn = document.createElement('button');
    deleteBtn.className = 'delete-btn';
    deleteBtn.textContent = 'Delete Story';
    li.appendChild(saveBtn);
    li.appendChild(editBtn);
    li.appendChild(deleteBtn);
    parentEl.appendChild(li);
    let firstNameText = firstName.value;
    let lasstNameText = lastName.value;
    let ageText = age.value;
    let storyTitleText = storyTitle.value;
    let storyText = story.value;
    clearInputs(firstName, lastName, age, storyTitle, story)
    publishBtn.disabled = true;

    editBtn.addEventListener('click', () => {
      reset(firstNameText, lasstNameText, ageText, storyTitleText, storyText);
      li.remove();
      publishBtn.disabled = false;
    });
    saveBtn.addEventListener('click', () => {
      let main = document.getElementById('main');
      document.getElementsByClassName('form-wrapper')[0].remove();
      document.getElementById('side-wrapper').remove();
      let h1 = document.createElement('h1');
      h1.textContent = 'Your scary story is saved!'
      main.appendChild(h1);
    });
    deleteBtn.addEventListener('click', () => {
      li.remove();
      publishBtn.disabled = false;
    });

  }
  function clearInputs(firstName, lastName, age, storyTitle, story) {
    firstName.value = '';
    lastName.value = '';
    age.value = '';
    storyTitle.value = '';
    story.value = '';
  }
  function reset(firstNameText, lasstNameText, ageText, storyTitleText, storyText) {
    firstName.value = firstNameText;
    lastName.value = lasstNameText;
    age.value = ageText;
    storyTitle.value = storyTitleText;
    story.value = storyText;
  }
}
