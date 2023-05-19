// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewEmail(ctx, "amazonSesEmailProvider", &auth0.EmailArgs{
//				Credentials: &auth0.EmailCredentialsArgs{
//					AccessKeyId:     pulumi.String("AKIAXXXXXXXXXXXXXXXX"),
//					Region:          pulumi.String("us-east-1"),
//					SecretAccessKey: pulumi.String("7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"),
//				},
//				DefaultFromAddress: pulumi.String("accounts@example.com"),
//				Enabled:            pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewEmail(ctx, "smtpEmailProvider", &auth0.EmailArgs{
//				Credentials: &auth0.EmailCredentialsArgs{
//					SmtpHost: pulumi.String("your.smtp.host.com"),
//					SmtpPass: pulumi.String("SMTP Password"),
//					SmtpPort: pulumi.Int(583),
//					SmtpUser: pulumi.String("SMTP Username"),
//				},
//				DefaultFromAddress: pulumi.String("accounts@example.com"),
//				Enabled:            pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewEmail(ctx, "sendgridEmailProvider", &auth0.EmailArgs{
//				Credentials: &auth0.EmailCredentialsArgs{
//					ApiKey: pulumi.String("secretAPIKey"),
//				},
//				DefaultFromAddress: pulumi.String("accounts@example.com"),
//				Enabled:            pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// As this is not a resource identifiable by an ID within the Auth0 Management API, email can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
//
// ```sh
//
//	$ pulumi import auth0:index/email:Email my_email_provider b4213dc2-2eed-42c3-9516-c6131a9ce0b0
//
// ```
type Email struct {
	pulumi.CustomResourceState

	// Configuration settings for the credentials for the email provider.
	Credentials EmailCredentialsOutput `pulumi:"credentials"`
	// Email address to use as the sender when no other "from" address is specified.
	DefaultFromAddress pulumi.StringOutput `pulumi:"defaultFromAddress"`
	// Indicates whether the email provider is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specific email provider settings.
	Settings EmailSettingsOutput `pulumi:"settings"`
}

// NewEmail registers a new resource with the given unique name, arguments, and options.
func NewEmail(ctx *pulumi.Context,
	name string, args *EmailArgs, opts ...pulumi.ResourceOption) (*Email, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Credentials == nil {
		return nil, errors.New("invalid value for required argument 'Credentials'")
	}
	if args.DefaultFromAddress == nil {
		return nil, errors.New("invalid value for required argument 'DefaultFromAddress'")
	}
	var resource Email
	err := ctx.RegisterResource("auth0:index/email:Email", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmail gets an existing Email resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmail(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailState, opts ...pulumi.ResourceOption) (*Email, error) {
	var resource Email
	err := ctx.ReadResource("auth0:index/email:Email", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Email resources.
type emailState struct {
	// Configuration settings for the credentials for the email provider.
	Credentials *EmailCredentials `pulumi:"credentials"`
	// Email address to use as the sender when no other "from" address is specified.
	DefaultFromAddress *string `pulumi:"defaultFromAddress"`
	// Indicates whether the email provider is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
	Name *string `pulumi:"name"`
	// Specific email provider settings.
	Settings *EmailSettings `pulumi:"settings"`
}

type EmailState struct {
	// Configuration settings for the credentials for the email provider.
	Credentials EmailCredentialsPtrInput
	// Email address to use as the sender when no other "from" address is specified.
	DefaultFromAddress pulumi.StringPtrInput
	// Indicates whether the email provider is enabled.
	Enabled pulumi.BoolPtrInput
	// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
	Name pulumi.StringPtrInput
	// Specific email provider settings.
	Settings EmailSettingsPtrInput
}

func (EmailState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailState)(nil)).Elem()
}

type emailArgs struct {
	// Configuration settings for the credentials for the email provider.
	Credentials EmailCredentials `pulumi:"credentials"`
	// Email address to use as the sender when no other "from" address is specified.
	DefaultFromAddress string `pulumi:"defaultFromAddress"`
	// Indicates whether the email provider is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
	Name *string `pulumi:"name"`
	// Specific email provider settings.
	Settings *EmailSettings `pulumi:"settings"`
}

// The set of arguments for constructing a Email resource.
type EmailArgs struct {
	// Configuration settings for the credentials for the email provider.
	Credentials EmailCredentialsInput
	// Email address to use as the sender when no other "from" address is specified.
	DefaultFromAddress pulumi.StringInput
	// Indicates whether the email provider is enabled.
	Enabled pulumi.BoolPtrInput
	// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
	Name pulumi.StringPtrInput
	// Specific email provider settings.
	Settings EmailSettingsPtrInput
}

func (EmailArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailArgs)(nil)).Elem()
}

type EmailInput interface {
	pulumi.Input

	ToEmailOutput() EmailOutput
	ToEmailOutputWithContext(ctx context.Context) EmailOutput
}

func (*Email) ElementType() reflect.Type {
	return reflect.TypeOf((**Email)(nil)).Elem()
}

func (i *Email) ToEmailOutput() EmailOutput {
	return i.ToEmailOutputWithContext(context.Background())
}

func (i *Email) ToEmailOutputWithContext(ctx context.Context) EmailOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailOutput)
}

// EmailArrayInput is an input type that accepts EmailArray and EmailArrayOutput values.
// You can construct a concrete instance of `EmailArrayInput` via:
//
//	EmailArray{ EmailArgs{...} }
type EmailArrayInput interface {
	pulumi.Input

	ToEmailArrayOutput() EmailArrayOutput
	ToEmailArrayOutputWithContext(context.Context) EmailArrayOutput
}

type EmailArray []EmailInput

func (EmailArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Email)(nil)).Elem()
}

func (i EmailArray) ToEmailArrayOutput() EmailArrayOutput {
	return i.ToEmailArrayOutputWithContext(context.Background())
}

func (i EmailArray) ToEmailArrayOutputWithContext(ctx context.Context) EmailArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailArrayOutput)
}

// EmailMapInput is an input type that accepts EmailMap and EmailMapOutput values.
// You can construct a concrete instance of `EmailMapInput` via:
//
//	EmailMap{ "key": EmailArgs{...} }
type EmailMapInput interface {
	pulumi.Input

	ToEmailMapOutput() EmailMapOutput
	ToEmailMapOutputWithContext(context.Context) EmailMapOutput
}

type EmailMap map[string]EmailInput

func (EmailMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Email)(nil)).Elem()
}

func (i EmailMap) ToEmailMapOutput() EmailMapOutput {
	return i.ToEmailMapOutputWithContext(context.Background())
}

func (i EmailMap) ToEmailMapOutputWithContext(ctx context.Context) EmailMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailMapOutput)
}

type EmailOutput struct{ *pulumi.OutputState }

func (EmailOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Email)(nil)).Elem()
}

func (o EmailOutput) ToEmailOutput() EmailOutput {
	return o
}

func (o EmailOutput) ToEmailOutputWithContext(ctx context.Context) EmailOutput {
	return o
}

// Configuration settings for the credentials for the email provider.
func (o EmailOutput) Credentials() EmailCredentialsOutput {
	return o.ApplyT(func(v *Email) EmailCredentialsOutput { return v.Credentials }).(EmailCredentialsOutput)
}

// Email address to use as the sender when no other "from" address is specified.
func (o EmailOutput) DefaultFromAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Email) pulumi.StringOutput { return v.DefaultFromAddress }).(pulumi.StringOutput)
}

// Indicates whether the email provider is enabled.
func (o EmailOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Email) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
func (o EmailOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Email) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specific email provider settings.
func (o EmailOutput) Settings() EmailSettingsOutput {
	return o.ApplyT(func(v *Email) EmailSettingsOutput { return v.Settings }).(EmailSettingsOutput)
}

type EmailArrayOutput struct{ *pulumi.OutputState }

func (EmailArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Email)(nil)).Elem()
}

func (o EmailArrayOutput) ToEmailArrayOutput() EmailArrayOutput {
	return o
}

func (o EmailArrayOutput) ToEmailArrayOutputWithContext(ctx context.Context) EmailArrayOutput {
	return o
}

func (o EmailArrayOutput) Index(i pulumi.IntInput) EmailOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Email {
		return vs[0].([]*Email)[vs[1].(int)]
	}).(EmailOutput)
}

type EmailMapOutput struct{ *pulumi.OutputState }

func (EmailMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Email)(nil)).Elem()
}

func (o EmailMapOutput) ToEmailMapOutput() EmailMapOutput {
	return o
}

func (o EmailMapOutput) ToEmailMapOutputWithContext(ctx context.Context) EmailMapOutput {
	return o
}

func (o EmailMapOutput) MapIndex(k pulumi.StringInput) EmailOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Email {
		return vs[0].(map[string]*Email)[vs[1].(string)]
	}).(EmailOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailInput)(nil)).Elem(), &Email{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailArrayInput)(nil)).Elem(), EmailArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailMapInput)(nil)).Elem(), EmailMap{})
	pulumi.RegisterOutputType(EmailOutput{})
	pulumi.RegisterOutputType(EmailArrayOutput{})
	pulumi.RegisterOutputType(EmailMapOutput{})
}
