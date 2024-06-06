const {test, expect} = require('@playwright/test');

test('Verify "All Books" link is visible', async({page}) => {
    
    //open the application
    await page.goto('http://localhost:3000');

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
    await page.goto('http://localhost:3000');

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
    await page.goto('http://localhost:3000');

    //local page toolbar
    await page.waitForSelector('nav.navbar');

    //get login button
    const registerButton = await page.$('a[href = "/register"]');

    //Verify the element is visible
    const isElementVisible = await registerButton.isVisible();

    expect(isElementVisible).toBe(true);


});