import {MapTo} from '@adobe/aem-react-editable-components';
import React, {Component} from "react";


const BlogTitleConfig = {
    emptyLabel: 'Blog Title',
    isEmpty: function (props) {
        return !props || !props.text || !props.author;
    }
};

export default class BlogTitle extends Component {
    render() {
        return (
            <div>
                <div className={"blogtitle__title"}>{this.props.text}</div>
                <div className={"blogtitle__author"}>{this.props.author}</div>
            </div>
        )
    }
}



MapTo('wknd-spa-react/components/blogtitle')(BlogTitle, BlogTitleConfig);