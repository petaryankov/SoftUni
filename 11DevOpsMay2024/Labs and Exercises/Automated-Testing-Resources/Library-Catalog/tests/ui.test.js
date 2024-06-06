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