const {test, expect} = require('@playwright/test');
const appUrl = 'http://localhost:3000';

test('Verify "All Books" link is visible', async({page}) => {
    
    //open the application
    await page.goto(appUrl);

    //local page toolbar
    await page.waitForSelector('nav.navbar');

    //get all books link
    const allBooksLink = await page.$('a[href = "/catalog"]');

    //Verify the element is visible
    const isElementVisible = await allBooksLink.isVisible();

    expect(isElementVisible).toBe(true);


});

test('Verify "Login" button is visible', async({page}) => {
    
    //open the application
    await page.goto(appUrl);

    //local page toolbar
    await page.waitForSelector('nav.navbar');

    //get login button
    const loginButton = await page.$('a[href = "/login"]');

    //Verify the element is visible
    const isElementVisible = await loginButton.isVisible();

    expect(isElementVisible).toBe(true);


});

test('Verify "Register" button is visible', async({page}) => {
    
    //open the application
    await page.goto(appUrl);

    //local page toolbar
    await page.waitForSelector('nav.navbar');

    //get register button
    const registerButton = await page.$('a[href = "/register"]');

    //Verify the element is visible
    const isElementVisible = await registerButton.isVisible();

    expect(isElementVisible).toBe(true);


});

test('Verify "All books" link is visible after login', async({page}) => {
    
    //open the application
    await page.goto(appUrl);

    //click loginButton
    await page.click('a[href = "/login"]')
    
    //fill the register user and submit
    await page.fill('#email', 'peter@abv.bg');
    await page.fill('input[name = "password"]', '123456');
    await page.click('input[type = "submit"]');

    //local page toolbar
    await page.waitForSelector('nav.navbar');

    //get all books link
    const allBooksLink = await page.$('a[href = "/catalog"]');

    //Verify the element is visible
    const isElementVisible = await allBooksLink.isVisible();

    expect(isElementVisible).toBe(true);


});