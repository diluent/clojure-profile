// vanilla JS
// init with element

const imgSet = [
    "https://www.rd.com/wp-content/uploads/2016/04/01-cat-wants-to-tell-you-laptop.jpg",
    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg",
    "https://s.abcnews.com/images/International/street-cat-night--1-gty-mem-180921_hpMain_16x9_992.jpg",
    "https://assets3.thrillist.com/v1/image/2351388/size/tmg-facebook_social.jpg",
];

var grid = document.querySelector('.grid');
var msnry = new Masonry( grid, {
  // options...
  itemSelector: '.grid-item',
  columnWidth: 200
});

// init with selector
var msnry = new Masonry( '.grid', {
  // options...
});
